/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class ASubtExp extends PExp
{
    private PExp _left_;
    private TSubt _subt_;
    private PExp _right_;

    public ASubtExp()
    {
        // Constructor
    }

    public ASubtExp(
        @SuppressWarnings("hiding") PExp _left_,
        @SuppressWarnings("hiding") TSubt _subt_,
        @SuppressWarnings("hiding") PExp _right_)
    {
        // Constructor
        setLeft(_left_);

        setSubt(_subt_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new ASubtExp(
            cloneNode(this._left_),
            cloneNode(this._subt_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASubtExp(this);
    }

    public PExp getLeft()
    {
        return this._left_;
    }

    public void setLeft(PExp node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TSubt getSubt()
    {
        return this._subt_;
    }

    public void setSubt(TSubt node)
    {
        if(this._subt_ != null)
        {
            this._subt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._subt_ = node;
    }

    public PExp getRight()
    {
        return this._right_;
    }

    public void setRight(PExp node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._subt_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._subt_ == child)
        {
            this._subt_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PExp) newChild);
            return;
        }

        if(this._subt_ == oldChild)
        {
            setSubt((TSubt) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
