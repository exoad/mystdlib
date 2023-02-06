package com.jackmeng.stl;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.util.Arrays;
import java.util.Objects;

public final class stl_SwingHelper
{
    private static final class $rr_corner_border_01
            implements
            Border
    {

        public final int radius, strokeThickness;
        public final Color color;
        public final Insets i;

        public $rr_corner_border_01(int radius, int thickness, Color color)
        {
            this(radius, thickness, color, null);
        }

        public $rr_corner_border_01(int radius, int thickness, Color c, Insets myInsets)
        {
            this.radius = radius;
            this.color = c;
            this.strokeThickness = thickness;
            this.i = myInsets == null
                    ? new Insets(Math.max(1, strokeThickness - 1), Math.max(1, strokeThickness - 1),
                    Math.max(1, strokeThickness - 1), Math.max(1, strokeThickness - 1))
                    : myInsets;
        }

        @Override public void paintBorder(Component c, Graphics g, int x, int y, int width, int height)
        {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.setStroke(new BasicStroke(strokeThickness));
            g2.setColor(color);
            g2.drawRoundRect(x, y, width, height, radius, radius);
            g2.dispose();
        }

        @Override public Insets getBorderInsets(Component c)
        {
            return i;
        }

        @Override public boolean isBorderOpaque()
        {
            return true;
        }
    }

    private stl_SwingHelper() {}

    public static Border rrect_border_uniform(int round_factor, Color color, int thickness)
    {
        return new $rr_corner_border_01(round_factor, thickness, color);
    }

    public static Shape rrect_clip(int x, int y, int arc_w, int arc_h, int w, int h)
    {
        return new RoundRectangle2D.Float(x, y, w, h, arc_w, arc_h);
    }
}
