package com.mycompany.blockychain.Models;
import java.util.Date;
/**
 * Class to model a block, where each block in the blockchain has its own hash signature (computed in part from the previous hash, the signature of the previous block and some data.
 */
public class Block {
    public String hash;
    public String previousBlockHash;
    private String data;
    private long timeStamp;

    public Block(String data, String previousBlockHash) {
        this.data = data;
        this.previousBlockHash = previousBlockHash;
        this.timeStamp = new Date().getTime();
    }
}