/* This file was generated by SableCC (http://www.sablecc.org/). */

package quase.node;

import quase.analysis.*;

@SuppressWarnings("nls")
public final class ASubtPartExp1 extends PExp1
{

    public ASubtPartExp1()
    {
        // Constructor
    }

    @Override
    public Object clone()
    {
        return new ASubtPartExp1();
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASubtPartExp1(this);
    }

    @Override
    public String toString()
    {
        return "";
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        throw new RuntimeException("Not a child.");
    }
}
