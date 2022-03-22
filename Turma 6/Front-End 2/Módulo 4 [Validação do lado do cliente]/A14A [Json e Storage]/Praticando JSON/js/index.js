const jsonData = `
{
  "squadName": "Super hero squad",
  "homeTown": "Metro City",
  "formed": 2016,
  "secretBase": "Super tower",
  "active": true,
  "members": [
    {
      "name": "Molecule Man",
      "age": 29,
      "secretIdentity": "Dan Jukes",
      "powers": ["Radiation resistance", "Turning tiny", "Radiation blast"]
    },
    {
      "name": "Madame Uppercut",
      "age": 39,
      "secretIdentity": "Jane Wilson",
      "powers": [
        "Million tonne punch",
        "Damage resistance",
        "Superhuman reflexes"
      ]
    },
    {
      "name": "Eternal Flame",
      "age": 1000000,
      "secretIdentity": "Unknown",
      "powers": [
        "Immortality",
        "Heat Immunity",
        "Inferno",
        "Teleportation",
        "Interdimensional travel"
      ]
    }
  ]
}
`;


let newJsonData = JSON.parse(jsonData)

function select(id) {
  return document.getElementById(id)
}

let ul = select('membros');

function liMessage(msg) {
  return ul.innerHTML += `<li>${msg}</li>`
}


//Percorra o JSON e insera os nomes dos membros na lista html
function percorrerMembros() {

  let arrayData = newJsonData.members;
  
  arrayData.forEach(e => {
    liMessage(e.name)
  });
  
}

percorrerMembros();