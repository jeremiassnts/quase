/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import java.util.*;
import quase.analysis.*;

@SuppressWarnings("nls")
public final class ADecVarAtributos extends PAtributos
{
    private final LinkedList<PDecVar> _decVar_ = new LinkedList<PDecVar>();

    public ADecVarAtributos()
    {
        // Constructor
    }

    public ADecVarAtributos(
        @SuppressWarnings("hiding") List<?> _decVar_)
    {
        // Constructor
        setDecVar(_decVar_);

    }

    @Override
    public Object clone()
    {
        return new ADecVarAtributos(
            cloneList(this._decVar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecVarAtributos(this);
    }

    public LinkedList<PDecVar> getDecVar()
    {
        return this._decVar_;
    }

    public void setDecVar(List<?> list)
    {
        for(PDecVar e : this._decVar_)
        {
            e.parent(null);
        }
        this._decVar_.clear();

        for(Object obj_e : list)
        {
            PDecVar e = (PDecVar) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._decVar_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._decVar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._decVar_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PDecVar> i = this._decVar_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDecVar) newChild);
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
