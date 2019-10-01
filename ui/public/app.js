var postalcodes;
var map;

// Bliver kaldt efter api kald
function getLocation(jData) {
  //Skriver data ud i consolen, som vi har fået fra vores api kald
  console.log(jData);

  postalcodes = jData.postalcodes[0];

  if (postalcodes != null || postalcodes != undefined) {
    // Sæt værdien i html og set vores map
    // Hvis du er usikker på hvilken data du har, så prøv at print postalcodes til consolen for at se
  }
}


// Denne metode skal kaldes når der trykkes søg
function postalCodeLookup() {
  console.log("Kører funktionen postalCodeLookup")
  // Land (DK) og postnummer skal hentes fra html og sættes ind hvor der er spørgsmålstegn 

  request = 'http://api.geonames.org/postalCodeLookupJSON?postalcode=' + "?" + '&country=' + "?" + '&callback=getLocation&username=kvetter';

  // Her sker der magi som behandler vores api kald
  aObj = new JSONscriptRequest(request);
  aObj.buildScriptTag();
  aObj.addScriptTag();
}

// Magi til at lave kortet skal nok bare ignoreres
function createMap() {
  map = new ol.Map({
    target: 'map',
    layers: [
      new ol.layer.Tile({
        source: new ol.source.OSM()
      })
    ],
    view: new ol.View({
      center: ol.proj.fromLonLat([37.41, 8.82]),
      zoom: 2
    })
  });
}

// Her kan vi sætte et nyt fokuspunkt for kortet
function setView(lat, long){
  map.setView(new ol.View({
    center: ol.proj.fromLonLat([lat, long]),
    zoom: 12
  }));
}

