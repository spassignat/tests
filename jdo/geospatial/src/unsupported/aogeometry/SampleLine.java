/**********************************************************************
 Copyright (c) 2007 Roger Blum, Pascal N�esch and others. All rights reserved.
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.

 Contributors:
 ...
 **********************************************************************/
package org.datanucleus.samples.aogeometry;

import com.esri.arcgis.geometry.Line;

public class SampleLine extends SampleGeometry
{
    private Line geom;
    
    public SampleLine(long id, String name, Line line)
    {
        this.id = id;
        this.name = name;
        this.geom = line;
    }

    public Line getGeom()
    {
        return geom;
    }
    
    public boolean equals(Object obj)
    {
        if (!(obj instanceof SampleLine))
            return false;

        SampleLine other = (SampleLine) obj;
        
        if (!(id == other.getId()))
            return false;
        
        if (!(name == null ? other.getName() == null : name.equals(other.getName())))
            return false;
        
        return geom.isEqual(other.getGeom());
    }
    
    public String toString() {
        return "id = " + id + " / name = " + name + " / geom = " + (geom == null ? "null" : geom.toString());
    }
}
