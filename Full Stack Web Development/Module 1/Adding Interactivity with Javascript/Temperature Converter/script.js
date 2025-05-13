function convertToFahrenheit(){
    let tempC = document.getElementById("celsiusInput").nodeValue;
    if (tempC === "") {
        alert("Please enter a temperature in Celsius.");
        return;
    }
    const tempF = (tempC * 9/5) + 32;

    document.getElementById("result").innerHTML = "Result: "+tempF;
}