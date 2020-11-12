
# Find first non repeated character of String
# Take sample String and print first non-duplicate character.
	

sample_str = "character"
print("Sample String :",sample_str)
non_dup = ""
for char in sample_str:
  count = 0
  for char_s in sample_str:
    if char.lower()==char_s.lower():
      count = count+1
  if count==1:
    non_dup = char
    break
if(non_dup):
	print("First non-duplicated character is : ",non_dup)
else:
  print("all character are repeating")
