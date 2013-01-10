package org.example;

import javax.inject.Inject;

import org.example.other.OtherExampleAddon;
import org.jboss.forge.container.services.Remote;

@Remote
public class ExampleService
{
   @Inject
   private OtherExampleAddon service;

   public int getRemoteHashCode()
   {
      return service.hashCode();
   }
}