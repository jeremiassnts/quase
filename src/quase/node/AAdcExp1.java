/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class AAdcExp1 extends PExp1
{
    private TAdc _adc_;
    private PExp _right_;

    public AAdcExp1()
    {
        // Constructor
    }

    public AAdcExp1(
        @SuppressWarnings("hiding") TAdc _adc_,
        @SuppressWarnings("hiding") PExp _right_)
    {
        // Constructor
        setAdc(_adc_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AAdcExp1(
            cloneNode(this._adc_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAdcExp1(this);
    }

    public TAdc getAdc()
    {
        return this._adc_;
    }

    public void setAdc(TAdc node)
    {
        if(this._adc_ != null)
        {
            this._adc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._adc_ = node;
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
            + toString(this._adc_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._adc_ == child)
        {
            this._adc_ = null;
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
        if(this._adc_ == oldChild)
        {
            setAdc((TAdc) newChild);
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
