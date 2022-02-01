#Author: FS
#Mision TIC-2021

import json

def compraProductos(vProductos, cPremios):
    sumaTotal = []
    salida = []
    sumaTotal = 0
    cPremio = cPremios.split() 
    jsonObject = json.loads(vProductos)
    
    for i in cPremio:
        for key in jsonObject:
            value = jsonObject[key]
            if key in i:
                salida.append(i)
                sumaTotal += value
        salidaFinal = " ".join(str(element) for element in salida)
    return (str(sumaTotal) + "\n" +  salidaFinal)
    
productosVentas = input("")
bPrizes = input("")
print(compraProductos(productosVentas, bPrizes))