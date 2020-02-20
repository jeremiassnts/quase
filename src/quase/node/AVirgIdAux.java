/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class AVirgIdAux extends PVirgIdAux
{
    private TVirg _virg_;
    private TId _id_;

    public AVirgIdAux()
    {
        // Constructor
    }

    public AVirgIdAux(
        @SuppressWarnings("hiding") TVirg _virg_,
        @SuppressWarnings("hiding") TId _id_)
    {
        // Constructor
        setVirg(_virg_);

        setId(_id_);

    }

    @Override
    public Object clone()
    {
        return new AVirgIdAux(
            cloneNode(this._virg_),
            cloneNode(this._id_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVirgIdAux(this);
    }

    public TVirg getVirg()
    {
        return this._virg_;
    }

    public void setVirg(TVirg node)
    {
        if(this._virg_ != null)
        {
            this._virg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._virg_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._virg_)
            + toString(this._id_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._virg_ == child)
        {
            this._virg_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._virg_ == oldChild)
        {
            setVirg((TVirg) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}