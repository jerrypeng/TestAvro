# To run
```
$ mvn clean install -DskipTests
$ java -cp target/TestAvro-1.0-SNAPSHOT.jar example.avro.Main
{"type":"record","name":"User","namespace":"example.avro","fields":[{"name":"name","type":["null","string"],"default":null},{"name":"favorite_number","type":["null","int"],"default":null},{"name":"favorite_color","type":["null","string"],"default":null},{"name":"age","type":"int"}]}
{"type":"record","name":"User","namespace":"example.avro","fields":[{"name":"name","type":"string"},{"name":"favorite_number","type":["int","null"]},{"name":"favorite_color","type":"string"},{"name":"age","type":"int","default":19}]}
{"type":"record","name":"User","namespace":"example.avro","fields":[{"name":"name","type":"string"},{"name":"favorite_number","type":["int","null"]},{"name":"favorite_color","type":"string"},{"name":"age","type":"int","default":19}]}
{"type":"record","name":"User","namespace":"example.avro","fields":[{"name":"name","type":"string"},{"name":"favorite_number","type":["int","null"]},{"name":"favorite_color","type":"string"},{"name":"age","type":"int","default":19}]}
```
