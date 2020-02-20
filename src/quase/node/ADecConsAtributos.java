/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

@SuppressWarnings("nls")
public final class ADecConsAtributos extends PAtributos
{
    private final LinkedList<PDecCons> _decCons_ = new LinkedList<PDecCons>();

    public ADecConsAtributos()
    {
        // Constructor
    }

    public ADecConsAtributos(
        @SuppressWarnings("hiding") List<?> _decCons_)
    {
        // Constructor
        setDecCons(_decCons_);

    }

    @Override
    public Object clone()
    {
        return new ADecConsAtributos(
            cloneList(this._decCons_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecConsAtributos(this);
    }

    public LinkedList<PDecCons> getDecCons()
    {
        return this._decCons_;
    }

    public void setDecCons(List<?> list)
    {
        for(PDecCons e : this._decCons_)
        {
            e.parent(null);
        }
        this._decCons_.clear();

        for(Object obj_e : list)
        {
            PDecCons e = (PDecCons) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._decCons_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decCons_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decCons_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PDecCons> i = this._decCons_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecCons) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
