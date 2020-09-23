package com.example.enviarobjeto;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Datos implements Parcelable {
    private String nombre;
    private String edad;

    public Datos(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    protected Datos(Parcel in) {
        nombre = in.readString();
        edad = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }



    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(edad);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Datos> CREATOR = new Parcelable.Creator<Datos>() {
        @Override
        public Datos createFromParcel(Parcel in) {
            return new Datos(in);
        }

        @Override
        public Datos[] newArray(int size) {
            return new Datos[size];
        }
    };
}
/*public class Datos {
    private String nombre;
    private String edad;

    public Datos(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
*/