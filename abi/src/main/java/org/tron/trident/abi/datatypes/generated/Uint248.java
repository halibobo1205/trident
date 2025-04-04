package org.tron.trident.abi.datatypes.generated;

import java.math.BigInteger;
import org.tron.trident.abi.datatypes.Uint;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.tron.trident.codegen.AbiTypesGenerator in the
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Uint248 extends Uint {

  public static final Uint248 DEFAULT = new Uint248(BigInteger.ZERO);

  public Uint248(BigInteger value) {
    super(248, value);
  }

  public Uint248(long value) {
    this(BigInteger.valueOf(value));
  }
}
