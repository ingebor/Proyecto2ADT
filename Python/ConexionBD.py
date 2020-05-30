from py2neo import Graph
graph = Graph("http://neo4j:Andres9740@127.0.0.1:7474/db/data")
#
#llenar un diccionario de enfermedades
def Enfdict():
    dit = {}

    enf = graph.run("match (a:Enfermedad) Return a.Nombre, a.Diarrea, a.DolorCabeza,a.DolorEstomago,a.Estornudo,a.DolorGeneral,a.FaltaEnergia,a.Tos,a.Vomito,a.Medicina,a.NotasAD").data()

    enf = graph.run("match (a:Enfermedad) Return a.Nombre, a.Diarrea, a.DolorCabeza,a.DolorEstomago,a.Estornudo,a.DolorGeneral,a.FaltaEnergia,a.Tos,a.Vomito,a.Medicina,a.NotasAD,a.Natural").data()
    for lista in enf:
        lista1 = []
        d = lista["a.Diarrea"]
        dc = lista["a.DolorCabeza"]
        de = lista["a.DolorEstomago"]
        e = lista["a.Estornudo"]
        dg = lista["a.DolorGeneral"]
        fe = lista["a.FaltaEnergia"]
        t = lista["a.Tos"]
        v = lista["a.Vomito"]
        Me = lista["a.Medicina"]
        Na = lista["a.NotasAD"]
        nat = lista["a.Natural"]
        lista1.append(d)
        lista1.append(dc)
        lista1.append(de)
        lista1.append(e)
        lista1.append(dg)
        lista1.append(fe)
        lista1.append(t)
        lista1.append(v)
        lista1.append(Me)
        lista1.append(Na)
        lista1.append(nat)
        dit[lista["a.Nombre"]] = lista1
    return dit
        
#llenar un diccionario de medicinas
def Meddict():
    dit = {}
    med = graph.run("match (a:Medicina) return a.Nombre,a.Precio,a.Ingestion,a.NotasAD,a.Enfermedad").data()
    for di in med:
        lista2 = []
        p = di["a.Precio"]
        I = di["a.Ingestion"]
        Na = di["a.NotasAD"]
        E = di["a.Enfermedad"]
        lista2.append(p)
        lista2.append(I)
        lista2.append(Na)
        lista2.append(E)
        dit[di["a.Nombre"]] = lista2
    return dit
        
    
#llenar una lista de enfermedades
def listEnf():
    listaFinal = []
    enf = graph.run("match (a:Enfermedad) Return a.Nombre, a.Diarrea, a.DolorCabeza,a.DolorEstomago,a.Estornudo,a.DolorGeneral,a.FaltaEnergia,a.Tos,a.Vomito").data()
    for lista in enf:
        listaTemp = []
        listaTemp.append(lista["a.Nombre"])
        listaTemp.append(lista["a.Diarrea"])
        listaTemp.append(lista["a.DolorCabeza"])
        listaTemp.append(lista["a.DolorEstomago"])
        listaTemp.append(lista["a.Estornudo"])
        listaTemp.append(lista["a.DolorGeneral"])
        listaTemp.append(lista["a.FaltaEnergia"])
        listaTemp.append(lista["a.Tos"])
        listaTemp.append(lista["a.Vomito"])
        listaFinal.append(listaTemp)
    return listaFinal

#llenar una lista de medicinas
def listMed():
    listaFinal = []
    med = graph.run("match (a:Medicina) return a.Nombre,a.Precio,a.Ingestion,a.NotasAD,a.Enfermedad").data()
    for lista in med:
        listaTemp = []
        listaTemp.append(lista["a.Nombre"])
        listaTemp.append(lista["a.Precio"])
        listaTemp.append(lista["a.Ingestion"])
        listaTemp.append(lista["a.NotasAD"])
        listaTemp.append(lista["a.Enfermedad"])
        listaFinal.append(listaTemp)
    return listaFinal
    
#buscar enfermedad
def BuscaEnf(nombre,dictionary):
    print(dictionary[nombre])
#buscar medicina
def BuscaMed(nombre,dictionary):
    print(dictionary[nombre])
    
#agregar medicina
def agregarMed(name):
    graph.run("create (n:Medicina {Nombre:"+name+"})").data()
#agregar enfermedad
def agregarEnf(name):
    graph.run("create (n:Enfermedad {Nombre:"+name+"})").data()
#eliminar medicina
def eliminarMed(name):
    graph.run("match (n:Medicina {Nombre:"+name+"}) delete n").data()
#eliminar enfermedad
def eliminarEnf(name):
    graph.run("match (n:Enfermedad {Nombre:"+name+"}) delete n").data()
 #agregar relacion   
def agregarRelacion(op1,op2,name1,name2,relacion):
    graph.run("match (a:"+op1+" {Nombre:"+name1+"}),(b:"+op2+" {Nombre:"+name2+"}) merge (a)-[r:"+relacion+"]->(b)").data()
#agregar atributo
def agregarA(nodo,nombre,atributo,valor):
    graph.run("match(n:"+nodo+" {Nombre:"+nombre+"}) set n."+atributo+"="+valor+"").data()
# eliminar relacion
def deleteR(op1,op2,name1,name2,relacion):
    graph.run("match (a:"+op1+" {Nombre:"+name1+"})-[r:"+relacion+"]->(b:"+op2+" {Nombre:"+name2+"})  delete r").data()
#eliminarA
def deleteA(nodo,nombre,atributo):
    graph.run("match (n:"+nodo+" {Nombre:"+nombre+"}) remove n."+atributo+"").data()
#recomendacion
#agregar todos los nodos y relaciones a unsa base de datos vacia
def addAll():
    f = open("lista.txt", "r")
    for x in f:
        graph.run(""+x+"").data()
    f.close()
    
    
#Diarrea,DolorCabeza,DolorEstomago,Estornudo,DolorGeneral,FaltaEnergia,Tos,Vomito,
def Recomendacion(Diarrea,DolorCabeza,DolorEstomago,Estornudo,DolorGeneral,FaltaEnergia,Tos,Vomito,listaEnf):
    mensaje = "puede tener:"
    for lista in listaEnf:
        contador = 0
        if Diarrea == lista[1]:
            contador += 1
        if DolorCabeza == lista[2]:
            contador += 1
        if DolorEstomago == lista[3]:
            contador += 1
        if Estornudo == lista[4]:
            contador += 1
        if DolorGeneral == lista[5]:
            contador += 1
        if FaltaEnergia == lista[6]:
            contador += 1
        if Tos == lista[7]:
            contador += 1
        if Vomito == lista[8]:
            contador += 1
        if contador >= 6:
            prob = ((contador/8)*100)-1
            probF = str(prob)
            mensaje += "\n" + lista[0] + " Con una Probabilidad de " + probF + "%"
    if mensaje == "puede tener:":
        mensaje = "No se ha encontrado ninguna enfermedad con este patron"
    return mensaje

    