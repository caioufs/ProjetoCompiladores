/* This file was generated by SableCC (http://www.sablecc.org/). */

package bemtevi.node;

import bemtevi.analysis.*;

@SuppressWarnings("nls")
public final class AInstanciaInstancia extends PInstancia
{
    private TIdMolde _idMolde_;
    private TAbreBloco _abreBloco_;
    private PListaInicializacao _listaInicializacao_;
    private TFechaBloco _fechaBloco_;

    public AInstanciaInstancia()
    {
        // Constructor
    }

    public AInstanciaInstancia(
        @SuppressWarnings("hiding") TIdMolde _idMolde_,
        @SuppressWarnings("hiding") TAbreBloco _abreBloco_,
        @SuppressWarnings("hiding") PListaInicializacao _listaInicializacao_,
        @SuppressWarnings("hiding") TFechaBloco _fechaBloco_)
    {
        // Constructor
        setIdMolde(_idMolde_);

        setAbreBloco(_abreBloco_);

        setListaInicializacao(_listaInicializacao_);

        setFechaBloco(_fechaBloco_);

    }

    @Override
    public Object clone()
    {
        return new AInstanciaInstancia(
            cloneNode(this._idMolde_),
            cloneNode(this._abreBloco_),
            cloneNode(this._listaInicializacao_),
            cloneNode(this._fechaBloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInstanciaInstancia(this);
    }

    public TIdMolde getIdMolde()
    {
        return this._idMolde_;
    }

    public void setIdMolde(TIdMolde node)
    {
        if(this._idMolde_ != null)
        {
            this._idMolde_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._idMolde_ = node;
    }

    public TAbreBloco getAbreBloco()
    {
        return this._abreBloco_;
    }

    public void setAbreBloco(TAbreBloco node)
    {
        if(this._abreBloco_ != null)
        {
            this._abreBloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._abreBloco_ = node;
    }

    public PListaInicializacao getListaInicializacao()
    {
        return this._listaInicializacao_;
    }

    public void setListaInicializacao(PListaInicializacao node)
    {
        if(this._listaInicializacao_ != null)
        {
            this._listaInicializacao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listaInicializacao_ = node;
    }

    public TFechaBloco getFechaBloco()
    {
        return this._fechaBloco_;
    }

    public void setFechaBloco(TFechaBloco node)
    {
        if(this._fechaBloco_ != null)
        {
            this._fechaBloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fechaBloco_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._idMolde_)
            + toString(this._abreBloco_)
            + toString(this._listaInicializacao_)
            + toString(this._fechaBloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._idMolde_ == child)
        {
            this._idMolde_ = null;
            return;
        }

        if(this._abreBloco_ == child)
        {
            this._abreBloco_ = null;
            return;
        }

        if(this._listaInicializacao_ == child)
        {
            this._listaInicializacao_ = null;
            return;
        }

        if(this._fechaBloco_ == child)
        {
            this._fechaBloco_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._idMolde_ == oldChild)
        {
            setIdMolde((TIdMolde) newChild);
            return;
        }

        if(this._abreBloco_ == oldChild)
        {
            setAbreBloco((TAbreBloco) newChild);
            return;
        }

        if(this._listaInicializacao_ == oldChild)
        {
            setListaInicializacao((PListaInicializacao) newChild);
            return;
        }

        if(this._fechaBloco_ == oldChild)
        {
            setFechaBloco((TFechaBloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
