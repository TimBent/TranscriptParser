package com.timothybent.jsontest;

import com.google.gson.Gson;
import com.timothybent.jsontest.Models.Result;
import com.timothybent.jsontest.Models.Transcript;
import com.timothybent.jsontest.Models.Words;

/**
 * Hello world!
 *
 */
public class App
{
    //public static String PATH;
    //public static Words words = new Words();

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        decentralizeWords();
        dectralizeAlternatives();
        //decentralizeResults();
    }

    private static void decentralizeWords(){
        String wordsJson =           "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 0,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 0,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"send\"\n" +
                "            }";

        Gson gson = new Gson();
        Words words = gson.fromJson(wordsJson, Words.class);

        //System.out.println(words.endTime.nanos +" "+ words.word +" "+ words.startTime.nanos);
    }

    public static void dectralizeAlternatives(){
        String script = "{\n" +
                "  \"results\": [\n" +
                "    {\n" +
                "      \"alternatives\": [\n" +
                "        {\n" +
                "          \"transcript\": \"send the flower to the car when you get back\",\n" +
                "          \"confidence\": 0.763741672039032,\n" +
                "          \"words\": [\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 0,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 0,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"send\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 0,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 0,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"word\": \"the\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 0,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"flower\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 500000000\n" +
                "              },\n" +
                "              \"word\": \"to\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 500000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"the\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"car\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"when\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"you\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"word\": \"get\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"back\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    {\n" +
                "      \"alternatives\": [\n" +
                "        {\n" +
                "          \"transcript\": \" not only do I get back at Jason response I send a file to Google Cloud Storage it extract the audio from that file turns into a flat file sings that in the storage then it transcribes the file from audio into text so it gives you a Json file an inside that Jason file it gives you the transcription that the each word in the transcription it gives you when the world started and when the word finished in milliseconds\",\n" +
                "          \"confidence\": 0.956902027130127,\n" +
                "          \"words\": [\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 4,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 500000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"word\": \"not\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"only\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"do\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"word\": \"I\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"word\": \"get\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"back\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"at\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 5,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 6,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"Jason\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 6,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 6,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"response\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 6,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 7,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"I\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 7,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 7,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"send\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 7,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 7,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"a\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 7,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 7,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"file\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 7,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 8,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"to\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 8,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 8,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"Google\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 8,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 9,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"Cloud\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 9,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 9,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"word\": \"Storage\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 9,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 10,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"it\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 10,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 10,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"extract\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 10,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 10,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"the\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 10,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 10,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"audio\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 10,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 11,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"from\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 11,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 11,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"word\": \"that\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 11,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 11,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"file\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 11,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 12,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"turns\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 12,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 12,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 500000000\n" +
                "              },\n" +
                "              \"word\": \"into\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 12,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 500000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 12,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"a\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 12,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 12,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"word\": \"flat\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 12,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 13,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"word\": \"file\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 13,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 14,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"sings\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 14,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 14,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"that\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 14,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 14,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"word\": \"in\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 14,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 14,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"word\": \"the\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 14,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 14,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"storage\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 14,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 15,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"then\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 15,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 16,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"it\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 16,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 16,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"word\": \"transcribes\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 16,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 17,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"word\": \"the\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 17,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 17,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"word\": \"file\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 17,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 18,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"word\": \"from\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 18,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 19,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"word\": \"audio\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 19,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 19,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"into\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 19,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 19,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 700000000\n" +
                "              },\n" +
                "              \"word\": \"text\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 19,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 700000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 20,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"so\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 20,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 21,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"word\": \"it\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 21,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 21,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"gives\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 21,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 21,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"you\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 21,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 21,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"word\": \"a\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 21,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 21,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 700000000\n" +
                "              },\n" +
                "              \"word\": \"Json\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 21,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 700000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 21,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"file\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 21,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 22,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"word\": \"an\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 22,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 22,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 700000000\n" +
                "              },\n" +
                "              \"word\": \"inside\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 22,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 700000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 22,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"that\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 22,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 23,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"Jason\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 23,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 23,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 500000000\n" +
                "              },\n" +
                "              \"word\": \"file\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 23,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 500000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 23,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 700000000\n" +
                "              },\n" +
                "              \"word\": \"it\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 23,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 700000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 23,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"word\": \"gives\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 23,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 24,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"word\": \"you\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 24,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 24,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"word\": \"the\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 24,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 24,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"transcription\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 24,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 25,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"word\": \"that\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 25,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 25,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"word\": \"the\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 25,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 25,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"each\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 25,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 25,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"word\": \"word\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 25,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 26,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"word\": \"in\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 26,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 26,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"the\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 26,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 26,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"word\": \"transcription\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 26,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 27,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"it\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 27,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 27,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"word\": \"gives\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 27,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 27,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 500000000\n" +
                "              },\n" +
                "              \"word\": \"you\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 27,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 500000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 28,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"word\": \"when\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 28,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 28,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"the\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 28,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 28,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"world\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 28,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 28,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"started\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 28,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 29,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"word\": \"and\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 29,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 0\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 29,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"when\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 29,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 29,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"the\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 29,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 29,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"word\": \"word\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 29,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 29,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"word\": \"finished\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 29,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 30,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"in\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 30,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 30,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 300000000\n" +
                "              },\n" +
                "              \"word\": \"milliseconds\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        Gson gson = new Gson();
        Transcript trasnscript = gson.fromJson(script, Transcript.class);
    }

    public static void decentralizeResults(){
        String results = "[{\n" +
                "      \"alternatives\": [\n" +
                "        {\n" +
                "          \"transcript\": \"send the flower to the car when you get back\",\n" +
                "          \"confidence\": 0.763741672039032,\n" +
                "          \"words\": [\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 0,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 0,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"send\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 0,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 0,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"word\": \"the\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 0,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 900000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"flower\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 500000000\n" +
                "              },\n" +
                "              \"word\": \"to\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 500000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"the\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"word\": \"car\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 1,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 800000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"word\": \"when\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 100000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"word\": \"you\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 200000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"word\": \"get\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"startTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 400000000\n" +
                "              },\n" +
                "              \"endTime\": {\n" +
                "                \"seconds\": {\n" +
                "                  \"low\": 2,\n" +
                "                  \"high\": 0,\n" +
                "                  \"unsigned\": false\n" +
                "                },\n" +
                "                \"nanos\": 600000000\n" +
                "              },\n" +
                "              \"word\": \"back\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ]\n" +
                "    }]";
        Gson gsoN = new Gson();
        Result result = gsoN.fromJson(results, Result.class);

        //System.out.print(result.alternative.get(0).transcript);
    }

}
