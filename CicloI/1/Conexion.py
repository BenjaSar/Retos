import math

def numeroUsuarios(uProgramacion):
    global lVirtual
    hSociales = 2 * uProgramacion + 4
    lVirtual = math.floor((uProgramacion + hSociales) / 5)

    return uProgramacion, hSociales, lVirtual


def asignacionSalas():
    if (0 < lVirtual <= 20):
        sala = "uno"

    elif (20 < lVirtual <= 30):
        sala = "dos"

    elif (30 < lVirtual < 51):
        sala = "tres"

    else:
        sala = "cuatro"

    return sala


nUsuarios = int(input("Ingrese el numero de alumnos:"))
print(numeroUsuarios(nUsuarios))
print(asignacionSalas())

