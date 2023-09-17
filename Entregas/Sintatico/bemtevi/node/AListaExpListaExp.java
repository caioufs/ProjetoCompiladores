/* This file was generated by SableCC (http://www.sablecc.org/). */

package bemtevi.node;

import java.util.*;
import bemtevi.analysis.*;

@SuppressWarnings("nls")
public final class AListaExpListaExp extends PListaExp
{
    private PExp _lista_;
    private final LinkedList<PMaisExp> _maisExp_ = new LinkedList<PMaisExp>();

    public AListaExpListaExp()
    {
        // Constructor
    }

    public AListaExpListaExp(
        @SuppressWarnings("hiding") PExp _lista_,
        @SuppressWarnings("hiding") List<?> _maisExp_)
    {
        // Constructor
        setLista(_lista_);

        setMaisExp(_maisExp_);

    }

    @Override
    public Object clone()
    {
        return new AListaExpListaExp(
            cloneNode(this._lista_),
            cloneList(this._maisExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaExpListaExp(this);
    }

    public PExp getLista()
    {
        return this._lista_;
    }

    public void setLista(PExp node)
    {
        if(this._lista_ != null)
        {
            this._lista_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lista_ = node;
    }

    public LinkedList<PMaisExp> getMaisExp()
    {
        return this._maisExp_;
    }

    public void setMaisExp(List<?> list)
    {
        for(PMaisExp e : this._maisExp_)
        {
            e.parent(null);
        }
        this._maisExp_.clear();

        for(Object obj_e : list)
        {
            PMaisExp e = (PMaisExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._maisExp_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lista_)
            + toString(this._maisExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lista_ == child)
        {
            this._lista_ = null;
            return;
        }

        if(this._maisExp_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lista_ == oldChild)
        {
            setLista((PExp) newChild);
            return;
        }

        for(ListIterator<PMaisExp> i = this._maisExp_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMaisExp) newChild);
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