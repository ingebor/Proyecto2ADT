from py2neo import Graph
graph = Graph("http://neo4j:Andres9740@127.0.0.1:7474/db/data")

#llenar un diccionario de enfermedades
def Enfdict():
    dit = {}
    lista1 = []
    enf = graph.run("match (a:Enfermedad) Return a.name, a.Diarrea, a.DolorCabeza,a.DolorEstomago,a.Estornudo,a.DolorGeneral,a.FaltaEnergia").data()
    for lista in enf:
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

#llenar una lista de enfermedades

#llenar una lista de medicinas

#buscar enfermedad

#buscar medicina

#agregar medicina

#agregar enfermedad

#eliminar medicina

#eliminar enfermedad

#recomendacion