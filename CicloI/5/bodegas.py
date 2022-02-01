def premios(lista_premios):
  salida = [] 
  lista_premio = list(lista_premios.strip("][,‘’'").split())
  fList = [n.strip(",‘’'") for n in lista_premio]  
  for articulos in  fList:
      if articulos not in salida:
          salida.append(articulos)
  return salida
  
def conocerPosiciones(lista_pos, lista_prem, premio):
    indices = []
    lista_premios = list(lista_prem.strip("][,‘’'").split())
    fList = [n.strip(",‘’'") for n in lista_premios]
    pos = -1
    prize = premio.strip("‘’'")
    for i in range(len(fList)):
        if fList[i] == prize:
            indices.append(i)
            pos = i
    return indices
    
def obtenerPremiosIntercambio(lista_sedeA, lista_sedeB):
    finalList = []
    listaSedeA = list(lista_sedeA.strip("][,‘’'").split())
    flista_sedeA = [n.strip(",‘’'") for n in listaSedeA]
    listaSedeB = list(lista_sedeB.strip("][,‘’'").split())
    flista_sedeB = [m.strip(",‘’'") for m in listaSedeB]
    for articles in flista_sedeB: 
        if articles not in flista_sedeA:
            finalList.append(articles)
    return finalList 
       
def obtenerCantidadMaximaIntercambios(lista_sedeA, lista_sedeB):
    finalListA = []
    elementos_listaA = 0
    finalListB = []
    elementos_listaB = 0
    listaSedeA = list(lista_sedeA.strip("][,‘’'").split())
    flista_sedeA = [n.strip(",‘’'") for n in listaSedeA]
    listaSedeB = list(lista_sedeB.strip("][,‘’'").split())
    flista_sedeB = [m.strip(",‘’'") for m in listaSedeB]
    for articles in flista_sedeB: 
        if articles not in flista_sedeA:
            finalListA.append(articles)
            elementos_listaA = len(finalListA)
    for articles in flista_sedeA:
        if articles not in flista_sedeB: 
            finalListB.append(articles)
            elementos_listaB = len(finalListB)
    if elementos_listaA > elementos_listaB:
        return elementos_listaB
    else:
        return elementos_listaA
