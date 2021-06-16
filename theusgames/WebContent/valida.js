/**
 * validação dos campos obrigatorios
 * 
 * @author Matheus Cesarini
 */

// validação dos campos obrigatorios
function validar() {
	// logo apos testar comentar o alert
	// alert("teste");
	// as linhas abaixo caoturam o conteudo da caixa de texto do formulario e
	// armazenam nas variaveis nome e fone
	
	let nome = frmcontato.nome.value;
	let valor = frmcontato.valor.value;
	let plataforma = frmcontato.plataforma.value;
	let quantidade = frmcontato.quantidade.value;
	// se nao foi preenchido
	if (nome == "") {
		alert("preencha o campo Nome");
		frmcontato.nome.focus();
		return false;
	} else if (valor == "") {
		alert("preencha o campo Valor");
		frmcontato.valor.focus();
		return false;
	} else if (plataforma == "") {
		alert("preencha o campo Plataforma");
		frmcontato.plataforma.focus();
		return false;
	} else if (quantidade == "") {
		alert("preencha o campo Quantidade");
		frmcontato.quantidade.focus();
		return false;
	} else {
		// a linha abaixo envia os dados do formulario ao servlet
		document.forms["frmcontato"].submit();
	}
}