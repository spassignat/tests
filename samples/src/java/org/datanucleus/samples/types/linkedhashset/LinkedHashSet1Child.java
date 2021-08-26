/**********************************************************************
Copyright (c) 2005 Andy Jefferson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License. 


Contributions
    ...
***********************************************************************/
package org.datanucleus.samples.types.linkedhashset;

/**
 * Container object for join LinkedHashSet tests, extending base class.
 * Used as a way of testing inherited container objects. 
 *
 * @version $Revision: 1.1 $    
 */
public class LinkedHashSet1Child extends LinkedHashSet1
{
    String name;

    public LinkedHashSet1Child()
    {
        super();
    }

    public LinkedHashSet1Child(String name)
    {
        super();
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return getClass().getName() + " : " + name + " [" + items.size() + " items]";
    }
}