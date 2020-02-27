/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class AComando2Comando1 extends PComando1
{
    private PComando2 _comando2_;

    public AComando2Comando1()
    {
        // Constructor
    }

    public AComando2Comando1(
        @SuppressWarnings("hiding") PComando2 _comando2_)
    {
        // Constructor
        setComando2(_comando2_);

    }

    @Override
    public Object clone()
    {
        return new AComando2Comando1(
            cloneNode(this._comando2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComando2Comando1(this);
    }

    public PComando2 getComando2()
    {
        return this._comando2_;
    }

    public void setComando2(PComando2 node)
    {
        if(this._comando2_ != null)
        {
            this._comando2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comando2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comando2_ == child)
        {
            this._comando2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comando2_ == oldChild)
        {
            setComando2((PComando2) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
