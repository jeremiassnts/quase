/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class AListaExpCom extends PListaExpCom
{
    private TVirg _virg_;
    private PExp _exp_;

    public AListaExpCom()
    {
        // Constructor
    }

    public AListaExpCom(
        @SuppressWarnings("hiding") TVirg _virg_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setVirg(_virg_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AListaExpCom(
            cloneNode(this._virg_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaExpCom(this);
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._virg_)
            + toString(this._exp_);
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

        if(this._exp_ == child)
        {
            this._exp_ = null;
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

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}