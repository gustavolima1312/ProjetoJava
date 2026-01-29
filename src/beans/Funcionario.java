package beans;

public class Funcionario {
    private int id;
    private String nomefunc;
    private Empresa empresaid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomefunc() {
        return nomefunc;
    }

    public void setNomefunc(String nomefunc) {
        this.nomefunc = nomefunc;
    }

    public Empresa getEmpresaid() {
        return empresaid;
    }

    public void setEmpresaid(Empresa empresaid) {
        this.empresaid = empresaid;
    }
    
    
}
