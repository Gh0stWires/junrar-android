/* InvalidEESignatureTest3.java
   Copyright (C) 2003  Free Software Foundation, Inc.

   Distributed under the GPL. See the file `COPYING' */

// Tags: PKITS

package gnu.testlet.gnu.crypto.pki.pkits;

public class InvalidEESignatureTest3 extends BaseInvalidTest
{
  public InvalidEESignatureTest3()
  {
    super(new String[] { "data/certs/InvalidEESignatureTest3EE.crt", "data/certs/GoodCACert.crt" },
          new String[] { "data/crls/GoodCACRL.crl" });
  }
}
