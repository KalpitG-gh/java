function fetchGreeting() {
    const name = document.getElementById("nameInput").value;
    fetch(`http://localhost:8080/greeting?name=${name}`)
        .then(response => response.json())
        .then(data => {
            document.getElementById("greeting").innerText = data.message;
        })
        .catch(error => console.error("Error:", error));
}
