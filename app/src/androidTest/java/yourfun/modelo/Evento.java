package yourfun.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Adolfo Andrade on 21/08/2016.
 */
public class Evento implements Serializable {
    private int id;
    private String titulo;
    private String banner;
    private Integer localId;
    private Local local;
    private String descricao;
    private Date data;
    private Date hora;
    private List<Ingresso> ingressos;
    private String url;
    private String classificacao;
    private Integer produtorId;
    private Produtor produtor;
    private Date Cadastrado;
    private Date Atualizado;
    private boolean estaAtivo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Integer getLocalId() {
        return localId;
    }

    public void setLocalId(Integer localId) {
        this.localId = localId;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public Integer getProdutorId() {
        return produtorId;
    }

    public void setProdutorId(Integer produtorId) {
        this.produtorId = produtorId;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public Date getCadastrado() {
        return Cadastrado;
    }

    public void setCadastrado(Date cadastrado) {
        Cadastrado = cadastrado;
    }

    public Date getAtualizado() {
        return Atualizado;
    }

    public void setAtualizado(Date atualizado) {
        Atualizado = atualizado;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }
}
