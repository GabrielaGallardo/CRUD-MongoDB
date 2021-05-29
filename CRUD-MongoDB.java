<dependency>
    <groupId>org.mongodb</groupId>
    <artifactId>mongo-java-driver</artifactId>
    <version>2.13.0</version>
</dependency>	
public class Alumnos {

	private String nombre;
	private String apellidos;
	private Integer edad;
    private Integer Notas;
	
}
ArrayList<Alumnos> Alumnos = new ArrayList<Alumnos>();
{
Alumnos.add(new Alumnos("Maria", "Gutierrez", 12, 
		new ArrayList<Integer>(Arrays.asList("10, 9"));
Alumnos.add(new Alumnos("Paablo", "Mendoza", 10, 
		new ArrayList<Integer>(Arrays.asList("8, 7"));
Alumnos.add(new Alumnos("Luis", "Lazo", 12, 
		new ArrayList<Integer>(Arrays.asList("9, 9"));

}
MongoClient mongoClient = new MongoClient("localhost", 27017);

DB db = mongoClient.getDB("Escuela");
DBCollection collection = db.getCollection("Alumnos");

for (Escuela fut : Escuela) {
    collection.insert(fut.toDBObjectEscuela());
}

DBCursor cursor = collection.find();
try {
	while (cursor.hasNext()) {
	    System.out.println(cursor.next().toString());
    }
} finally {
	cursor.close();
}

DBObject query = new BasicDBObject("Notas", new BasicDBObject("$regex", "Notas"));
cursor = collection.find(query);
try {
	while (cursor.hasNext()) {
		Futbolista Escuela = new Escuela((BasicDBObject) cursor.next());
		System.out.println(Escuela.toString());
	}
} finally {
	cursor.close();
}