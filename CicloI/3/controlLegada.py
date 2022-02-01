#Author: FS
#Mision TIC-2021

from itertools import groupby
etapa = []
fPalabras = []
def generacion(personas):
  persona = personas.split()
  fPalabras = [len(list(group)) for key, group in groupby(persona)]
  for i in range(len(persona)):
      if persona[i] not in etapa:
              etapa.append(persona[i])
      else:
          if persona[i] != persona[i-1]:
              etapa.append(persona[i])
  final = " ".join(etapa)
  ffPalabras = " ".join(str(element) for element in fPalabras)
  
  return (final + "\n" + ffPalabras) 
people = input("")
print(generacion(people))

#Ejercicios/Retos/3/controlLegada.py  