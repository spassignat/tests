/**********************************************************************
Copyright (c) 2004 Andy Jefferson and others. All rights reserved. 
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
package org.datanucleus.samples.annotations.embedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Representation of a Computer.
 */
@Entity(name="AnnotComputer")
@Table(name="ANN_COMPUTER")
public class Computer
{
    @Id
    private long id; // Used by application identity

    private String operatingSystem;

    @Embedded
    private ComputerCard graphicsCard;

    @Embedded
    private ComputerCard soundCard;

    public Computer(String osName, ComputerCard graphics, ComputerCard sound)
    {
        this.operatingSystem = osName;
        this.graphicsCard = graphics;
        if (this.graphicsCard != null)
        {
            this.graphicsCard.setComputer(this);
        }
        this.soundCard = sound;
        if (this.soundCard != null)
        {
            this.soundCard.setComputer(this);
        }
    }

    public long getId()
    {
        return id;
    }

    public String getOperatingSystem()
    {
        return operatingSystem;
    }

    public ComputerCard getGraphicsCard()
    {
        return graphicsCard;
    }

    public ComputerCard getSoundCard()
    {
        return soundCard;
    }

    public void setOperatingSystem(String os)
    {
        this.operatingSystem = os;
    }

    public void setGraphicsCard(ComputerCard graphics)
    {
        this.graphicsCard = graphics;
    }

    public void setSoundCard(ComputerCard sound)
    {
        this.soundCard = sound;
    }
}