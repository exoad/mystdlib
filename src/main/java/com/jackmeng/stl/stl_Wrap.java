// Copyright 2023 Jack Meng. All rights reserved.
// Use of this source code is governed by a BSD-style
// license that can be found in the LICENSE file.

package com.jackmeng.stl;

public class stl_Wrap< T >
{
    public T obj;

    public stl_Wrap(T e)
    {
        this.obj = e;
    }

    public T obj()
    {
        return obj;
    }

    public void obj(T obj)
    {
        this.obj = obj;
    }

    public synchronized void s_obj(T obj)
    {
        this.obj = obj;
    }
}
