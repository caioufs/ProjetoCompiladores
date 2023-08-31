/* This file was generated by SableCC (http://www.sablecc.org/). */

package bemtevi.node;

import java.util.*;
import bemtevi.analysis.*;

@SuppressWarnings("nls")
public final class AAtributosAtributos extends PAtributos
{
    private final LinkedList<PAttrAux> _attrAux_ = new LinkedList<PAttrAux>();

    public AAtributosAtributos()
    {
        // Constructor
    }

    public AAtributosAtributos(
        @SuppressWarnings("hiding") List<?> _attrAux_)
    {
        // Constructor
        setAttrAux(_attrAux_);

    }

    @Override
    public Object clone()
    {
        return new AAtributosAtributos(
            cloneList(this._attrAux_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAtributosAtributos(this);
    }

    public LinkedList<PAttrAux> getAttrAux()
    {
        return this._attrAux_;
    }

    public void setAttrAux(List<?> list)
    {
        for(PAttrAux e : this._attrAux_)
        {
            e.parent(null);
        }
        this._attrAux_.clear();

        for(Object obj_e : list)
        {
            PAttrAux e = (PAttrAux) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._attrAux_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._attrAux_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._attrAux_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PAttrAux> i = this._attrAux_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAttrAux) newChild);
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