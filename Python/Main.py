import ConexionBD as cb


DictEnf = {}
DictEnf = cb.Enfdict()
listaEnf = cb.listEnf()
dictMed = cb.Meddict()
listaMed = cb.listMed()
#print("recomendacion")
#res = cb.Recomendacion("Si","Si","Si","Si","Si","No","Si","No",listaEnf)
#print(res)
#op = input("Ingrese un nombre: ")
#name = "'"+op+"'"
#cb.agregarMed(name)
#cb.agregarEnf(name)
#cb.eliminarMed(name)
#cb.eliminarEnf(name)

flag = True
print("---------------------")
print("|    Bienvenido!    |")
print("---------------------")
print("¿Que desea realizar a continuacion?")
while flag:
    option1=input("Desea ingresar como: \n1. Administrador\n2. Paciente\n3. Salir del programa\n")
    if option1=="1":
        flagAdmin = True
        while flagAdmin:
            user = input("Ingrese el nombre de usuario: ")
            if user == "Administrador":
                flagUserName=True
                while flagUserName:
                    password = input("Ingrese la contrasena: ")
                    if password == "proyectoADT":
                        flagMenuAdmin = True
                        while flagMenuAdmin:
                            opAdmin = input("\n¿Que desea realizar?\n1. Agregar un medicamento\n2. Agregar una enfermedad\n3.Eliminar un medicamento \n4. Eliminar una enfermedad\n5. Regresar al menu anterior\n6. Salir del programa\n")
                            if opAdmin=="1":
                                Medicamento = input("Ingrese el nombre del medicamento: ")
                                med = "'"+Medicamento+"'"
                                try:
                                    cb.agregarMed(med)
                                    print("Se ha cargado correctamente")
                                except:
                                    print("Ha ingresado algo incorrecto")
                            elif opAdmin=="2":
                                Enfermedad = input("Ingrese el nombre de la enfermedad: ")
                                enfer = "'"+Enfermedad+"'"
                                try:
                                    cb.agregarEnf(enfer)
                                    print("Se ha cargado correctamente")
                                except:
                                    print("Ha ingresado algo incorrecto")
                            elif opAdmin=="3":
                                drug = input("Ingrese el nombre del medicamento que desea borrar: ")
                                deleteDrug = "'"+drug+"'"
                                try:
                                    cb.eliminarMed(deleteDrug)
                                    print("Se ha eliminado correctamente")
                                except:
                                    print("Ha ingresado algo incorrecto")
                            elif opAdmin=="4":
                                Enfermedads = input("ingrese el nombre de la enfermedad que desea borrar: ")
                                deleteEnf = "'"+Enfermedads+"'"
                                try:
                                    cb.eliminarEnf(deleteEnf)
                                    print("Se ha eliminado correcto")
                                except:
                                    print("Ha ingresado algo incorrecto")
                                
                            elif opAdmin == "5":
                                flagMenuAdmin = False
                                flagUserName = False
                                flagAdmin = False
                            elif opAdmin=="6":
                                print("¡Muchas gracias por utilizar el programa! Hasta la proxima")
                                flagMenuAdmin = False
                                flagUserName = False
                                flagAdmin=False
                                flag=False
                            else:
                                print("\n----No ha ingresado un dato valido, intentelo de nuevo por favor----")
                    else:
                        print("Contrasena incorrecta, intentelo de nuevo")
            else:
                print("Nombre de usuario incorrecto, intentelo de nuevo")
    elif option1 =="2":
        flag2 = True
        while flag2:
            opUser = input("\n¿Que desea realizar?\n1. Deseo consultar los sintomas de cierta enfermedad\n2. Deseo conocer las especificaciones de un medicamento especifico\n"+
            "3. Cuento con sintomas y desconozco la razon, deseo ingresar mis sintomas\n4. Regresar al menu anterior\n5. Salir del programa\n")
            if opUser=="1":
                userOp1 = True
                while userOp1:
                    illName = input("Ingrese el nombre de la enfermedad por favor: ")
                    try:
                        print("Los sintomas son: ")
                        cb.BuscaEnf(illName,DictEnf)
                        lastUserOp1 = True
                        while lastUserOp1:
                            inpUserOp1 = input("\nDesea:\n1. Regresar al menu anterior\n2. Salir del programa\n")
                            if inpUserOp1 == "1":
                                lastUserOp1 = False
                                userOp1 = False
                            elif inpUserOp1 == "2":
                                print("\n¡Muchas gracias por utilizar el programa! Hasta la proxima")
                                lastUserOp1 = False
                                userOp1 = False
                                flag2 = False
                                flag = False
                            else:
                                print("\n----No ha ingresado un dato valido, intentelo de nuevo por favor----")
                    except:
                        print("No se ha encontrado la enfermedad :(")
            elif opUser =="2":
                userOp2 = True
                while userOp2:
                    drugName = input("Ingrese el nombre del medicamento por favor: ")
                    try:
                        print("Las especificaciones del medicamento son: ")
                        cb.BuscaMed(drugName,dictMed)
                        lastUserOp2 = True
                        while lastUserOp2:
                            inpUserOp2 = input("\nDesea:\n1. Regresar al menu anterior\n2. Salir del programa\n")
                            if inpUserOp2 == "1":
                                lastUserOp2 = False
                                userOp2 = False
                            elif inpUserOp2 == "2":
                                print("\n¡Muchas gracias por utilizar el programa! Hasta la proxima")
                                lastUserOp2 = False
                                userOp2 = False
                                flag2 = False
                                flag = False
                            else:
                                print("\n----No ha ingresado un dato valido, intentelo de nuevo por favor----")
                    except:
                        print("Este medicamento no se encuentra en la base de datos, intentelo de nuevo por favor")
            elif opUser=="3":
                print("De los siguientes sintomás responda: Si y No dependiendo si cuenta con ellos")
                diarrea = input("Diarrea: \n->")
                DolorCabeza  = input("Dolor de cabeza: \n->")
                DolorEstomago = input("Dolor de estomago: \n->")
                Estornudo = input("Tiene congestion nasal: \n->")
                DolorGeneral = input("Siente dolor General: \n->")
                FaltaEnergia = input("Se siente cansado y sin energia?: \n->")
                Tos = input("Tiene tos?: \n->")
                Vomito = input("ha tenido episodios de nauseas y vomito?: \n->")
                res = cb.Recomendacion(diarrea,DolorCabeza,DolorEstomago,Estornudo,DolorGeneral,FaltaEnergia,Tos,Vomito,listaEnf)
                print(res)
                
                lastUserOp3 = True
                while lastUserOp3:
                    inpUserOp3 = input("\nDesea:\n1. Regresar al menu anterior\n2. Salir del programa\n")
                    if inpUserOp3 == "1":
                        lastUserOp3 = False
                        userOp3 = False
                    elif inpUserOp3 == "2":
                        print("\n¡Muchas gracias por utilizar el programa! Hasta la proxima")
                        lastUserOp3 = False
                        userOp3 = False
                        flag2 = False
                        flag = False
                    else:
                        print("\n----No ha ingresado un dato valido, intentelo de nuevo por favor----")
            elif opUser == "4":
                flag2 = False
            elif opUser == "5":
                print("\n¡Muchas gracias por utilizar el programa! Hasta la proxima")
                flag2 = False
                flag = False
            else:
                print("\n----No ha ingresado un dato valido, intentelo de nuevo por favor----")
    elif option1 =="3":
        print("\n¡Muchas gracias por utilizar el programa! Hasta la proxima")
        flag = False
    else:
        print("\n----No ha ingresado un dato valido, intentelo de nuevo por favor----\n")
    
        
    