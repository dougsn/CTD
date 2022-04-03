let data = {
    image_id: "bi",
    value: 1
}


let settings = {
    method: "POST",
    headers: {
        "Content-Type": "application/json",
        "x-api-key": "172198c0-c97d-4d63-8789-99358cb135a2"
    },
    body: JSON.stringify(data)
};

fetch('https://api.thecatapi.com/v1/votes', settings)
    .then((response) => {
        return response.json();
    })
    .then((info) => {
        console.log(info);
    })
    .catch((error) => {
        console.log(error);
    });