/* This file was generated by SableCC (http://www.sablecc.org/). */

package bemtevi.node;

import bemtevi.analysis.*;

@SuppressWarnings("nls")
public final class TComparacao extends Token
{
    public TComparacao()
    {
        super.setText("==");
    }

    public TComparacao(int line, int pos)
    {
        super.setText("==");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComparacao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComparacao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComparacao text.");
    }
}