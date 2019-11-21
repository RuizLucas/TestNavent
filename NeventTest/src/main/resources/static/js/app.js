/**
 * 
 */

function confirmar(form) {
	if (confirm('Esta seguro de realizar el envio?')) {
		if (form.elements.nombre.value == '') {
			alert("El campo Nombre es obligatorio");
		} else {
			submitForm(form);
		}

	} else {
		return false;
	}
}

function submitForm(form) {
	let txt;
	let xhr = new XMLHttpRequest();
	xhr.open('POST', "./pedidos/guardar");
	xhr.setRequestHeader('Content-Type', 'application/json;charset=UTF-8');

	jsonSend = JSON.stringify({
		"nombre" : form.elements.nombre.value,
		"monto" : form.elements.monto.value,
		"descuento" : form.elements.descuento.value,

	})

	xhr.send(jsonSend);

}
