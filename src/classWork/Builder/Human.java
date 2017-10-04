package classWork.Builder;

import java.io.*;

public class Human implements Externalizable, Serializable{
    private String lastName;
    private String firstName;
    private char sex;
    private int age;
    private String country;

    private Human(){

    }

    private Human(Builder builder) {
        lastName = builder.lastName;
        firstName = builder.firstName;
        sex = builder.sex;
        age = builder.age;
        country = builder.country;
    }


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getSex() {
        return sex;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    /**
     * The object implements the writeExternal method to save its contents
     * by calling the methods of DataOutput for its primitive values or
     * calling the writeObject method of ObjectOutput for objects, strings,
     * and arrays.
     *
     * @param out the stream to write the object to
     * @throws IOException Includes any I/O exceptions that may occur
     * @serialData Overriding methods should use this tag to describe
     * the data layout of this Externalizable object.
     * List the sequence of element types and, if possible,
     * relate the element to a public/protected field and/or
     * method of this Externalizable class.
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
       out.writeObject(this.lastName);
       out.writeObject(this.firstName);
       out.writeChar(this.sex);
       out.writeInt(this.age);
       out.writeObject(this.country);
       out.close();
    }

    /**
     * The object implements the readExternal method to restore its
     * contents by calling the methods of DataInput for primitive
     * types and readObject for objects, strings and arrays.  The
     * readExternal method must read the values in the same sequence
     * and with the same types as were written by writeExternal.
     *
     * @param in the stream to read data from in order to restore the object
     * @throws IOException            if I/O errors occur
     * @throws ClassNotFoundException If the class for an object being
     *                                restored cannot be found.
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        in.readObject();
        in.readObject();
        in.readChar();
        in.readInt();
        in.readObject();
    }

    static class Builder {

        private String lastName;
        private String firstName;
        private char sex;
        private int age;
        private String country;

        public Builder() {
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withSex(char sex) {
            this.sex = sex;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }


}


