package example.avro;

import org.apache.avro.reflect.ReflectData;
import org.apache.avro.reflect.ReflectData.AllowNull;

public class Main {

    public static void main(String[] args){

        System.out.println(new String(org.apache.pulsar.client.impl.schema.AvroSchema.of(User.class).getSchemaInfo().getSchema()));

        System.out.println(new String(example.avro.AvroSchema.of(User.class).getSchemaInfo().getSchema()));

        System.out.println(ReflectData.get().getSchema(User.class));

        System.out.println(AllowNull.get().getSchema(User.class));
    }
}
