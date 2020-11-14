package com.tenfloors.art;

public class ArtBuilder {

	public ArtBuilder() {

	}

	public void printMonster() {

	}

	public void printDragon() {
		StringBuilder sb = new StringBuilder();
		sb.append("                 /           /                                               ").append(System.lineSeparator());    //System.lineSeparator() gets us the new line character which is used by the underlying OS.
		sb.append("                /' .,,,,  ./                                                 ").append(System.lineSeparator());
		sb.append("               /';'     ,/                                                   ").append(System.lineSeparator());
		sb.append("              / /   ,,//,`'`                                                 ").append(System.lineSeparator());
		sb.append("             ( ,, '_,  ,,,' ``                                               ").append(System.lineSeparator());
		sb.append("             |    /@  ,,, ;\" `                                               ").append(System.lineSeparator());
		sb.append("            /    .   ,''/' `,``                                              ").append(System.lineSeparator());
		sb.append("           /   .     ./, `,, ` ;                                             ").append(System.lineSeparator());
		sb.append("        ,./  .   ,-,',` ,,/''\\,'                                             ").append(System.lineSeparator());
		sb.append("       |   /; ./,,'`,,'' |   |                                               ").append(System.lineSeparator());
		sb.append("       |     /   ','    /    |                                               ").append(System.lineSeparator());
		sb.append("        \\___/'   '     |     |                                               ").append(System.lineSeparator());
		sb.append("          `,,'  |      /     `\\                                              ").append(System.lineSeparator());
		sb.append("Art by         /      |        ~\\                                            ").append(System.lineSeparator());
		sb.append(" Ooyamaneko   '       (                                                      ").append(System.lineSeparator());
		sb.append("             :                                                               ").append(System.lineSeparator());
		sb.append("            ; .         \\--                                                  ").append(System.lineSeparator());
		sb.append("          :   \\         ;").append(System.lineSeparator());
		System.out.println(sb);
	}

}
