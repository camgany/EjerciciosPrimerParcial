package primerParcial.prototype;

import prototype.example.entradas.IEntrada;

public class Contrato implements IEntrada {
    //Sueldo, Carga_Horaria, Curso_Educacion_Superior, AccesoPlataforma,
    //Marcado Biometrico, Marcado Hora de Entrada,
    //Marcado hora de Salida, Nombre, Apellido.
    private int sueldo;
    private int cargaHoraria;
    private boolean cursoEducacionSuperior;
    private boolean accesoPlataforma;
    private boolean mercadoBiometrico;
    private String mercadoHoraEntrada;
    private String mercadoHoraSalida;
    private Persona persona = new Persona();

    public Contrato(){}

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMercadoBiometrico() {
        return mercadoBiometrico;
    }

    public void setMercadoBiometrico(boolean mercadoBiometrico) {
        this.mercadoBiometrico = mercadoBiometrico;
    }

    public String getMercadoHoraEntrada() {
        return mercadoHoraEntrada;
    }

    public void setMercadoHoraEntrada(String mercadoHoraEntrada) {
        this.mercadoHoraEntrada = mercadoHoraEntrada;
    }

    public String getMercadoHoraSalida() {
        return mercadoHoraSalida;
    }

    public void setMercadoHoraSalida(String mercadoHoraSalida) {
        this.mercadoHoraSalida = mercadoHoraSalida;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public Object clone() {
        Persona cloneP = new Persona();
        cloneP.setNombre(this.getPersona().getNombre());
        cloneP.setApellido(this.getPersona().getApellido());

        Contrato clone = new Contrato();
        clone.setSueldo(this.getSueldo());
        clone.setCargaHoraria(this.getCargaHoraria());
        clone.setCursoEducacionSuperior(this.isCursoEducacionSuperior());
        clone.setAccesoPlataforma(this.isAccesoPlataforma());
        clone.setMercadoBiometrico(this.isMercadoBiometrico());
        clone.setMercadoHoraEntrada(this.getMercadoHoraEntrada());
        clone.setMercadoHoraSalida(this.getMercadoHoraSalida());
        clone.setPersona(cloneP);
        return clone;
    }
    public void showInfo(){
        System.out.println("-------------------------CONTRATO DE TRABAJO------------------------");
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Carga Horaria: "+cargaHoraria);
        System.out.println("Curso Educacion Superor: "+cursoEducacionSuperior);
        System.out.println("Acceso a Plataforma: "+accesoPlataforma);
        System.out.println("Mercado Biometrico: "+mercadoBiometrico);
        System.out.println("Mercado Hora de Entrada: "+mercadoHoraEntrada);
        System.out.println("Mercado Hora de Salida: "+mercadoHoraSalida);
        System.out.println("Nombre: "+persona.getNombre() + " Apellido: "+persona.getApellido());


    }
}
