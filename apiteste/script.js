const formulario = document.querySelector("form");
const Inome = document.querySelector(".nome");
const Ilogin = document.querySelector(".login");
const Iemail = document.querySelector(".email");
const Isenha = document.querySelector(".senha");
const Itelefone = document.querySelector(".telefone");

function cadastrar(){  
    fetch("http://localhost:8080/usuarios", 
    {    
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    },
    method: "POST",
    body: JSON.stringify({
        login: Ilogin.value,
        nome: Inome.value,
        email: Iemail.value,
        senha: Isenha.value,
        telefone: Itelefone.value
    })
    })
    .then(function(res) {console.log(res)})
    .catch(function(res) {console.log(res)})
};

function limpar() {
    Ilogin.value = "";
    Inome.value = "";
    Iemail.value= "";
    Isenha.value= "";
    Itelefone.value= "";
};

formulario.addEventListener('submit', function(event){
    event.preventDefault();

    cadastrar();
    limpar();
    console.log(dados);

});
