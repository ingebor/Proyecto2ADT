#Universidad del Valle de Guatemala
#Proyecto No. 2, sistema de recomendacion. Algoritmos y estructura de datos
#Andres Say 19705, Ayleen Rubio 19003, 19214
import ConexionBD as cb


DictEnf = {}
DictEnf = cb.Enfdict()
listaEnf = cb.listEnf()
dictMed = cb.Meddict()
listaMed = cb.listMed()



flag = False
print("---------------------")
print("|    Bienvenido!    |")
print("---------------------")
inicio = True
while inicio:
    inicial = input("\nSeleccionar una opcion: \n1. Llenar base de datos y continuar\n2. Unicamente continuar\n**Advertencia** Si su base de datos no se encuentra llena, no podra utilizar el programa apropiadamente\n")
    if inicial=="1":
        print("Esto puede tardar unos segundos, espere por favor")
        cb.addAll()
        print("\nListo!")
        print("Inicie el programa de nuevo por favor")
        flag = False
        inicio = False
    elif inicial == "2":
        flag = True
        inicio = False
    else:
        print("\n----No ha ingresado un dato valido, intentelo de nuevo por favor----")

while flag:
    print("\n¿Que desea realizar a continuacion?")
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
                            opAdmin = input("\n¿Que desea realizar?\n1. Agregar un medicamento\n2. Agregar una enfermedad\n3. Eliminar un medicamento \n4. Eliminar una enfermedad\n5. Agregar una relacion \n6. Agregar un atributo (propiedad) \n7. Eliminar una relacion \n8. Eliminar un atributo\n9. Regresar al menu anterior\n10. Salir del programa\n")
                            if opAdmin=="1":
                                Medicamento = input("Ingrese el nombre del medicamento: ").capitalize()
                                med = "'"+Medicamento+"'"
                                try:
                                    cb.agregarMed(med)
                                    print("-Se ha cargado correctamente, revise la base de datos")
                                except:
                                    print("-La conexion a la base de datos tiene un problema, intentelo de nuevo por favor")
                            elif opAdmin=="2":
                                Enfermedad = input("Ingrese el nombre de la enfermedad: ").capitalize()
                                enfer = "'"+Enfermedad+"'"
                                try:
                                    cb.agregarEnf(enfer)
                                    print("-Se ha cargado correctamente, revise la base de datos")
                                except:
                                    print("-La conexion a la base de datos tiene un problema, intentelo de nuevo por favor")
                            elif opAdmin=="3":
                                drug = input("Ingrese el nombre del medicamento que desea borrar: ").capitalize()
                                deleteDrug = "'"+drug+"'"
                                try:
                                    cb.eliminarMed(deleteDrug)
                                    print("Se ha eliminado correctamente, revise la base de datos")
                                except:
                                    print("-Ha ingresado algo incorrecto, intentelo de nuevo por favor")
                            elif opAdmin=="4":
                                Enfermedads = input("Ingrese el nombre de la enfermedad que desea borrar: ").capitalize()
                                deleteEnf = "'"+Enfermedads+"'"
                                try:
                                    cb.eliminarEnf(deleteEnf)
                                    print("Se ha eliminado correctamente, revise la base de datos")
                                except:
                                    print("-Ha ingresado algo incorrecto, intentelo de nuevo por favor")
                            elif opAdmin == "5":
                                print("Ingrese a continuacion el tipo nodo que desea relacionar")
                                op1 = input("nodo 1: ").capitalize()
                                op2 = input("nodo 2: ").capitalize()
                                print("Ingrese a continuacion los nombres los nodos")
                                nombre1 = input("nombre1: ").capitalize()
                                nombre2 = input("nombre2: ").capitalize()
                                print("Ingrese el nombre de la relacion que desea colocar")
                                relacion = input("Ingrese la relacion: ")
                                nombre1F = "'"+nombre1+"'"
                                nombre2F = "'"+nombre2+"'"
                                try:
                                    cb.agregarRelacion(op1,op2,nombre1F,nombre2F,relacion)
                                    print("Se ha creado la relacion correctamente, revise la base de datos")
                                except:
                                    print("-Ha ingresado algo incorrecto, intentelo de nuevo por favor")
                            elif opAdmin == "6":
                                nodo = input("Ingreso el tipo de nodo: ").capitalize()
                                nombre = input("Ingrese el nombre del nodo: ").capitalize()
                                atributo = input("Ingrese el tipo de atributo que desea colocar: ").capitalize()
                                valor = input("Ingrese el nombre del valor que desea colocar a ese atributo: ").capitalize()
                                nombreF = "'"+nombre+"'"
                                valorF = "'"+valor+"'"
                                try:
                                    cb.agregarA(nodo,nombreF,atributo,valorF)
                                    print("Se ha cargado correctamente, revise la base de datos")
                                except:
                                    print("-Ha ingresado algo mal, intentelo de nuevo por favor")
                            elif opAdmin == "7":
                                print("Ingrese a continuacion el tipo nodos en donde eliminara una relacion")
                                op1 = input("nodo 1: ").capitalize()
                                op2 = input("nodo 2: ").capitalize()
                                print("Ingrese a continuacion los nombres los nodos")
                                nombre1 = input("nombre1: ").capitalize()
                                nombre2 = input("nombre2: ").capitalize()
                                print("Ingrese la relacion que desea eliminar: ")
                                relacion = input("Ingrese la relacion: ").capitalize()
                                nombre1F = "'"+nombre1+"'"
                                nombre2F = "'"+nombre2+"'"
                                try:
                                    cb.deleteR(op1,op2,nombre1F,nombre2F,relacion)
                                    print("Se ha eliminado correctamente, revise la base de datos")
                                except:
                                    print("-Ha ingresado algo mal, intentelo de nuevo por favor")
                            elif opAdmin == "8":
                                nodo = input("Ingreso el tipo de nodo: ").capitalize()
                                nombre = input("Ingrese el nombre del nodo: ").capitalize()
                                atributo = input("Ingrese el atributo que desea eliminar: ").capitalize()
                                nombreF = "'"+nombre+"'"
                                try:
                                    cb.deleteA(nodo,nombreF,atributo)
                                    print("Se ha eliminado correctamente, revise la base de datos")
                                except:
                                    print("-Ha ingresado algo mal, intentelo de nuevo por favor")
                                print("op8 e atributo")
                            elif opAdmin == "9":
                                flagMenuAdmin = False
                                flagUserName = False
                                flagAdmin = False
                            elif opAdmin=="10":
                                print("¡Muchas gracias por utilizar el programa! Hasta la proxima")
                                flagMenuAdmin = False
                                flagUserName = False
                                flagAdmin=False
                                flag=False
                            else:
                                print("\n----No ha ingresado un dato valido, intentelo de nuevo por favor----")
                    else:
                        print("*Contrasena incorrecta, intentelo de nuevo")
            else:
                print("*Nombre de usuario incorrecto, intentelo de nuevo")
    elif option1 =="2":
        flag2 = True
        while flag2:
            opUser = input("\n¿Que desea realizar?\n1. Deseo consultar los sintomas de cierta enfermedad\n2. Deseo conocer las especificaciones de un medicamento especifico\n"+
            "3. Cuento con sintomas y desconozco la razon, deseo ingresar mis sintomas\n4. Regresar al menu anterior\n5. Salir del programa\n")
            if opUser=="1":
                userOp1 = True
                while userOp1:
                    illName = input("Ingrese el nombre de la enfermedad por favor: ").capitalize()
                    try:
                        print("Los sintomas son los siguientes: ")
                        sintomas = cb.BuscaEnf(illName,DictEnf)
                        print("->Diarrea: "+sintomas[0])
                        print("->Dolor de Cabeza: "+sintomas[1])
                        print("->Dolor de estomago: "+sintomas[2])
                        print("->Congestion nasal: "+sintomas[3])
                        print("->Dolor corporal: "+sintomas[4])
                        print("->Cansancio, fatiga: "+sintomas[5])
                        print("->Tos: "+sintomas[6])
                        print("->Vomitos: "+sintomas[7])
                        print("Para esta enfermedad se tienen las siguientes recomendaciones: ")
                        print("->Datos importantes que deben tomarse en cuenta: "+sintomas[9])
                        print("->Medicamento que puede aliviar los sintomas: "+sintomas[8])
                        print("->Remedios naturales para aliviar los sintomas: "+sintomas[10])
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
                        print("\n--La enfermedad ingresada no se encuntra en la base de datos, lo sentimos. Intentelo de nuevo por favor--\n")
            elif opUser =="2":
                userOp2 = True
                while userOp2:
                    drugName = input("Ingrese el nombre del medicamento por favor: ").capitalize()
                    try:
                        print("Las especificaciones del medicamento son las siguientes: ")
                        medicamento = cb.BuscaMed(drugName,dictMed)
                        print("->Tiene un precio de: "+medicamento[0])
                        print("->El modo de ingestion es: "+medicamento[1])
                        print("->Datos importantes que debe tomar en cuenta: "+medicamento[2])
                        print("->La(s) enfermedad(es) para la(s) que es utilizada: " +medicamento[3])
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
                        print("\n--Este medicamento no se encuentra en la base de datos, lo sentimos. Intentelo de nuevo por favor--\n")
            elif opUser=="3":
                print("De los siguientes sintomas responda: Si y No, dependiendo si cuenta con ellos o no\n")
                diarrea = input("Diarrea: \n->").capitalize()
                DolorCabeza  = input("Dolor de cabeza: \n->").capitalize()
                DolorEstomago = input("Dolor de estomago: \n->").capitalize()
                Estornudo = input("Congestion nasal: \n->").capitalize()
                DolorGeneral = input("Dolor General: \n->").capitalize()
                FaltaEnergia = input("Cansancio y poca energia: \n->").capitalize()
                Tos = input("Tos: \n->").capitalize()
                Vomito = input("Episodios de nauseas y vomito: \n->").capitalize()
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
    
        
    