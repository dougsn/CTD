import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Integer codigo;
    private Date data;
    private Cliente cliente;
    private List<Item> itens = new ArrayList<>();


    public Pedido(Integer codigo, Date data, Cliente cliente) {
        this.codigo = codigo;
        this.data = data;
        this.cliente = cliente;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
