
document.getElementById('loginForm').addEventListener('submit', function(e) {
    e.preventDefault(); // Impede o envio tradicional do formulário


    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    fetch('http://localhost:8080/api/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ username: username, password: password })
    })
        .then(response => response.json())
        .then(data => {

            if (data.status === 'success') {
                alert('Login realizado com sucesso!');
                window.location.href = 'dashboard.html';
            } else {
                alert('Usuário ou senha incorretos');
            }
        })
        .catch(error => {
            console.error('Erro:', error);
            alert('Erro ao tentar fazer login');
        });
});
