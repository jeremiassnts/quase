/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class AAtrComando extends PComando
{
    private TId _id_;
    private TIgualSimples _igualSimples_;
    private PExp _exp_;
    private TPontoVirg _pontoVirg_;

    public AAtrComando()
    {
        // Constructor
    }

    public AAtrComando(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TIgualSimples _igualSimples_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TPontoVirg _pontoVirg_)
    {
        // Constructor
        setId(_id_);

        setIgualSimples(_igualSimples_);

        setExp(_exp_);

        setPontoVirg(_pontoVirg_);

    }

    @Override
    public Object clone()
    {
        return new AAtrComando(
            cloneNode(this._id_),
            cloneNode(this._igualSimples_),
            cloneNode(this._exp_),
            cloneNode(this._pontoVirg_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAtrComando(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TIgualSimples getIgualSimples()
    {
        return this._igualSimples_;
    }

    public void setIgualSimples(TIgualSimples node)
    {
        if(this._igualSimples_ != null)
        {
            this._igualSimples_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._igualSimples_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TPontoVirg getPontoVirg()
    {
        return this._pontoVirg_;
    }

    public void setPontoVirg(TPontoVirg node)
    {
        if(this._pontoVirg_ != null)
        {
            this._pontoVirg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoVirg_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._igualSimples_)
            + toString(this._exp_)
            + toString(this._pontoVirg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._igualSimples_ == child)
        {
            this._igualSimples_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._pontoVirg_ == child)
        {
            this._pontoVirg_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._igualSimples_ == oldChild)
        {
            setIgualSimples((TIgualSimples) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._pontoVirg_ == oldChild)
        {
            setPontoVirg((TPontoVirg) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}