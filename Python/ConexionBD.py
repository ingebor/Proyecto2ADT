from py2neo import Graph
graph = Graph("http://neo4j:Andres9740@127.0.0.1:7474/db/data")
#
#llenar un diccionario de enfermedades
def Enfdict():
    dit = {}
    enf = graph.run("match (a:Enfermedad) Return a.name, a.Diarrea, a.DolorCabeza,a.DolorEstomago,a.Estornudo,a.DolorGeneral,a.FaltaEnergia").data()
    for lista in enf:
        lista1 = []
        d = lista["a.Diarrea"]
        dc = lista["a.DolorCabeza"]
        de = lista["a.DolorEstomago"]
        e = lista["a.Estornudo"]
        dg = lista["a.DolorGeneral"]
        fe = lista["a.FaltaEnergia"]
        lista1.append(d)
        lista1.append(dc)
        lista1.append(de)
        lista1.append(e)
        lista1.append(dg)
        lista1.append(fe)
        dit[lista["a.name"]] = lista1
    return dit
        
#llenar un diccionario de medicinas
def Meddict():
    dit = {}
    med = graph.run("match (a:Medicina) return a.name,a.Precio,a.Ingestion,a.NotasAd,a.Enfermedad").data()
    for di in med:
        lista2 = []
        p = di["a.Precio"]
        I = di["a.Ingestion"]
        Na = di["a.NotasAd"]
        E = di["a.Enfermedad"]
        lista2.append(p)
        lista2.append(I)
        lista2.append(Na)
        lista2.append(E)
        dit[di["a.name"]] = lista2
    return dit
        
    
#llenar una lista de enfermedades
def listEnf():
    listaFinal = []
    enf = graph.run("match (a:Enfermedad) Return a.name, a.Diarrea, a.DolorCabeza,a.DolorEstomago,a.Estornudo,a.DolorGeneral,a.FaltaEnergia").data()
    for lista in enf:
        listaTemp = []
        listaTemp.append(lista["a.name"])
        listaTemp.append(lista["a.Diarrea"])
        listaTemp.append(lista["a.DolorCabeza"])
        listaTemp.append(lista["a.DolorEstomago"])
        listaTemp.append(lista["a.Estornudo"])
        listaTemp.append(lista["a.DolorGeneral"])
        listaTemp.append(lista["a.FaltaEnergia"])
        listaFinal.append(listaTemp)
    return listaFinal

#llenar una lista de medicinas
def listMed():
    listaFinal = []
    med = graph.run("match (a:Medicina) return a.name,a.Precio,a.Ingestion,a.NotasAd,a.Enfermedad").data()
    for lista in med:
        listaTemp = []
        listaTemp.append(lista["a.name"])
        listaTemp.append(lista["a.Precio"])
        listaTemp.append(lista["a.Ingestion"])
        listaTemp.append(lista["a.NotasAd"])
        listaTemp.append(lista["a.Enfermedad"])
        listaFinal.append(listaTemp)
    return listaFinal
    
    


#buscar enfermedad

#buscar medicina

#agregar medicina

#agregar enfermedad

#eliminar medicina

#eliminar enfermedad

#recomendacion