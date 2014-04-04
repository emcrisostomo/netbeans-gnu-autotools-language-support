package org.netbeans.gnu.autotools.autoconf.parser.javacc;

public class MyToken extends Token
{
  /**
   * Constructs a new token for the specified Image and Kind.
   */
  public MyToken(int kind, String image)
  {
     this.kind = kind;
     this.image = image;
  }

  //int realKind = AutoconfParserConstants.GT;

  /**
   * Returns a new Token object.
  */

  public static final Token newToken(int ofKind, String tokenImage)
  {
    return new MyToken(ofKind, tokenImage);
  }
}
