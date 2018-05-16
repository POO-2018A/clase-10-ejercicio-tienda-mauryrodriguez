package ejerciciotienda;


public class ClaseCliente {
        private String nombre;
        private String apellido;
        private String cedula;
        private String direccion;
        private int numTelefono;
        
        public ClaseCliente (String nombre, String apellido, String cedula, String direccion, int telefono) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula= cedula;
        this.direccion=direccion;
        this.numTelefono=numTelefono;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return numTelefono;
    }

    public void setTelefono(int telefono) {
        this.numTelefono = telefono;
    }
        
    
}
